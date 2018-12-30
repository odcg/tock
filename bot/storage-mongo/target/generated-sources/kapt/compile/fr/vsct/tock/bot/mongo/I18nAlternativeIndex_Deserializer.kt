package fr.vsct.tock.bot.mongo

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.module.SimpleModule
import fr.vsct.tock.translator.I18nLabel
import fr.vsct.tock.translator.UserInterfaceType
import java.time.Instant
import java.util.Locale
import kotlin.Int
import kotlin.String
import kotlin.collections.Map
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.full.findParameterByName
import kotlin.reflect.full.primaryConstructor
import org.litote.jackson.JacksonModuleServiceLoader
import org.litote.kmongo.Id

internal class I18nAlternativeIndex_Deserializer :
        StdDeserializer<I18nAlternativeIndex>(I18nAlternativeIndex::class.java),
        JacksonModuleServiceLoader {
    override fun module() = SimpleModule().addDeserializer(I18nAlternativeIndex::class.java, this)

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): I18nAlternativeIndex {
        with(p) {
            var _labelId_: Id<I18nLabel>? = null
            var _labelId_set = false
            var _namespace_: String? = null
            var _namespace_set = false
            var _locale_: Locale? = null
            var _locale_set = false
            var _interfaceType_: UserInterfaceType? = null
            var _interfaceType_set = false
            var _connectorId_: String? = null
            var _connectorId_set = false
            var _contextId_: String? = null
            var _contextId_set = false
            var _index_: Int? = null
            var _index_set = false
            var _date_: Instant? = null
            var _date_set = false
            while (currentToken != JsonToken.END_OBJECT && currentToken != JsonToken.END_ARRAY) { 
                if(currentToken != JsonToken.FIELD_NAME) { nextToken() }
                if (currentToken == JsonToken.END_OBJECT || currentToken == JsonToken.END_ARRAY) {
                        break } 
                val fieldName = currentName
                nextToken()
                when (fieldName) { 
                    "labelId" -> {
                            _labelId_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(_labelId__reference);
                            _labelId_set = true
                            }
                    "namespace" -> {
                            _namespace_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _namespace_set = true
                            }
                    "locale" -> {
                            _locale_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Locale::class.java);
                            _locale_set = true
                            }
                    "interfaceType" -> {
                            _interfaceType_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(UserInterfaceType::class.java);
                            _interfaceType_set = true
                            }
                    "connectorId" -> {
                            _connectorId_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _connectorId_set = true
                            }
                    "contextId" -> {
                            _contextId_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _contextId_set = true
                            }
                    "index" -> {
                            _index_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Int::class.java);
                            _index_set = true
                            }
                    "date" -> {
                            _date_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Instant::class.java);
                            _date_set = true
                            }
                    else -> {
                            if (currentToken == JsonToken.START_OBJECT || currentToken ==
                                    JsonToken.START_ARRAY)
                            p.skipChildren()
                            nextToken()
                            }
                    } 
                } 
            return if(_labelId_set && _namespace_set && _locale_set && _interfaceType_set &&
                    _connectorId_set && _contextId_set && _index_set && _date_set)
                    I18nAlternativeIndex(labelId = _labelId_!!, namespace = _namespace_!!, locale =
                            _locale_!!, interfaceType = _interfaceType_!!, connectorId =
                            _connectorId_, contextId = _contextId_!!, index = _index_!!, date =
                            _date_!!)
                    else {
                    val map = mutableMapOf<KParameter, Any?>()
                    if(_labelId_set)
                    map[parameters.getValue("labelId")] = _labelId_
                    if(_namespace_set)
                    map[parameters.getValue("namespace")] = _namespace_
                    if(_locale_set)
                    map[parameters.getValue("locale")] = _locale_
                    if(_interfaceType_set)
                    map[parameters.getValue("interfaceType")] = _interfaceType_
                    if(_connectorId_set)
                    map[parameters.getValue("connectorId")] = _connectorId_
                    if(_contextId_set)
                    map[parameters.getValue("contextId")] = _contextId_
                    if(_index_set)
                    map[parameters.getValue("index")] = _index_
                    if(_date_set)
                    map[parameters.getValue("date")] = _date_ 
                    primaryConstructor.callBy(map) 
                    }
        } 
    }

    companion object {
        private val primaryConstructor: KFunction<I18nAlternativeIndex> by
                lazy(LazyThreadSafetyMode.PUBLICATION) {
                I18nAlternativeIndex::class.primaryConstructor!! }

        private val parameters: Map<String, KParameter> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                kotlin.collections.mapOf("labelId" to
                primaryConstructor.findParameterByName("labelId")!!, "namespace" to
                primaryConstructor.findParameterByName("namespace")!!, "locale" to
                primaryConstructor.findParameterByName("locale")!!, "interfaceType" to
                primaryConstructor.findParameterByName("interfaceType")!!, "connectorId" to
                primaryConstructor.findParameterByName("connectorId")!!, "contextId" to
                primaryConstructor.findParameterByName("contextId")!!, "index" to
                primaryConstructor.findParameterByName("index")!!, "date" to
                primaryConstructor.findParameterByName("date")!!) }

        private val _labelId__reference: TypeReference<Id<I18nLabel>> = object :
                TypeReference<Id<I18nLabel>>() {}
    }
}
