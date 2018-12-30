package fr.vsct.tock.translator

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.module.SimpleModule
import java.util.LinkedHashSet
import kotlin.Int
import kotlin.String
import kotlin.collections.Map
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.full.findParameterByName
import kotlin.reflect.full.primaryConstructor
import org.litote.jackson.JacksonModuleServiceLoader
import org.litote.kmongo.Id

internal class I18nLabel_Deserializer : StdDeserializer<I18nLabel>(I18nLabel::class.java),
        JacksonModuleServiceLoader {
    override fun module() = SimpleModule().addDeserializer(I18nLabel::class.java, this)

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): I18nLabel {
        with(p) {
            var __id_: Id<I18nLabel>? = null
            var __id_set = false
            var _namespace_: String? = null
            var _namespace_set = false
            var _category_: String? = null
            var _category_set = false
            var _i18n_: LinkedHashSet<I18nLocalizedLabel>? = null
            var _i18n_set = false
            var _defaultLabel_: String? = null
            var _defaultLabel_set = false
            var _version_: Int? = null
            var _version_set = false
            while (currentToken != JsonToken.END_OBJECT && currentToken != JsonToken.END_ARRAY) { 
                if(currentToken != JsonToken.FIELD_NAME) { nextToken() }
                if (currentToken == JsonToken.END_OBJECT || currentToken == JsonToken.END_ARRAY) {
                        break } 
                val fieldName = currentName
                nextToken()
                when (fieldName) { 
                    "_id" -> {
                            __id_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(__id__reference);
                            __id_set = true
                            }
                    "namespace" -> {
                            _namespace_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _namespace_set = true
                            }
                    "category" -> {
                            _category_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _category_set = true
                            }
                    "i18n" -> {
                            _i18n_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(_i18n__reference);
                            _i18n_set = true
                            }
                    "defaultLabel" -> {
                            _defaultLabel_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _defaultLabel_set = true
                            }
                    "version" -> {
                            _version_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Int::class.java);
                            _version_set = true
                            }
                    else -> {
                            if (currentToken == JsonToken.START_OBJECT || currentToken ==
                                    JsonToken.START_ARRAY)
                            p.skipChildren()
                            nextToken()
                            }
                    } 
                } 
            return if(__id_set && _namespace_set && _category_set && _i18n_set && _defaultLabel_set
                    && _version_set)
                    I18nLabel(_id = __id_!!, namespace = _namespace_!!, category = _category_!!,
                            i18n = _i18n_!!, defaultLabel = _defaultLabel_, version = _version_!!)
                    else {
                    val map = mutableMapOf<KParameter, Any?>()
                    if(__id_set)
                    map[parameters.getValue("_id")] = __id_
                    if(_namespace_set)
                    map[parameters.getValue("namespace")] = _namespace_
                    if(_category_set)
                    map[parameters.getValue("category")] = _category_
                    if(_i18n_set)
                    map[parameters.getValue("i18n")] = _i18n_
                    if(_defaultLabel_set)
                    map[parameters.getValue("defaultLabel")] = _defaultLabel_
                    if(_version_set)
                    map[parameters.getValue("version")] = _version_ 
                    primaryConstructor.callBy(map) 
                    }
        } 
    }

    companion object {
        private val primaryConstructor: KFunction<I18nLabel> by
                lazy(LazyThreadSafetyMode.PUBLICATION) { I18nLabel::class.primaryConstructor!! }

        private val parameters: Map<String, KParameter> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                kotlin.collections.mapOf("_id" to primaryConstructor.findParameterByName("_id")!!,
                "namespace" to primaryConstructor.findParameterByName("namespace")!!, "category" to
                primaryConstructor.findParameterByName("category")!!, "i18n" to
                primaryConstructor.findParameterByName("i18n")!!, "defaultLabel" to
                primaryConstructor.findParameterByName("defaultLabel")!!, "version" to
                primaryConstructor.findParameterByName("version")!!) }

        private val __id__reference: TypeReference<Id<I18nLabel>> = object :
                TypeReference<Id<I18nLabel>>() {}

        private val _i18n__reference: TypeReference<LinkedHashSet<I18nLocalizedLabel>> = object :
                TypeReference<LinkedHashSet<I18nLocalizedLabel>>() {}
    }
}
