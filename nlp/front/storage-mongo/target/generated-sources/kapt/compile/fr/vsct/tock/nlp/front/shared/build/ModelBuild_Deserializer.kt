package fr.vsct.tock.nlp.front.shared.build

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.module.SimpleModule
import fr.vsct.tock.nlp.front.shared.config.ApplicationDefinition
import fr.vsct.tock.nlp.front.shared.config.IntentDefinition
import java.time.Duration
import java.time.Instant
import java.util.Locale
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.Map
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter
import kotlin.reflect.full.findParameterByName
import kotlin.reflect.full.primaryConstructor
import org.litote.jackson.JacksonModuleServiceLoader
import org.litote.kmongo.Id

internal class ModelBuild_Deserializer : StdDeserializer<ModelBuild>(ModelBuild::class.java),
        JacksonModuleServiceLoader {
    override fun module() = SimpleModule().addDeserializer(ModelBuild::class.java, this)

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): ModelBuild {
        with(p) {
            var _applicationId_: Id<ApplicationDefinition>? = null
            var _applicationId_set = false
            var _language_: Locale? = null
            var _language_set = false
            var _type_: ModelBuildType? = null
            var _type_set = false
            var _intentId_: Id<IntentDefinition>? = null
            var _intentId_set = false
            var _entityTypeName_: String? = null
            var _entityTypeName_set = false
            var _nbSentences_: Int? = null
            var _nbSentences_set = false
            var _duration_: Duration? = null
            var _duration_set = false
            var _error_: Boolean? = null
            var _error_set = false
            var _errorMessage_: String? = null
            var _errorMessage_set = false
            var _date_: Instant? = null
            var _date_set = false
            while (currentToken != JsonToken.END_OBJECT && currentToken != JsonToken.END_ARRAY) { 
                if(currentToken != JsonToken.FIELD_NAME) { nextToken() }
                if (currentToken == JsonToken.END_OBJECT || currentToken == JsonToken.END_ARRAY) {
                        break } 
                val fieldName = currentName
                nextToken()
                when (fieldName) { 
                    "applicationId" -> {
                            _applicationId_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(_applicationId__reference);
                            _applicationId_set = true
                            }
                    "language" -> {
                            _language_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Locale::class.java);
                            _language_set = true
                            }
                    "type" -> {
                            _type_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(ModelBuildType::class.java);
                            _type_set = true
                            }
                    "intentId" -> {
                            _intentId_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(_intentId__reference);
                            _intentId_set = true
                            }
                    "entityTypeName" -> {
                            _entityTypeName_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _entityTypeName_set = true
                            }
                    "nbSentences" -> {
                            _nbSentences_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Int::class.java);
                            _nbSentences_set = true
                            }
                    "duration" -> {
                            _duration_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Duration::class.java);
                            _duration_set = true
                            }
                    "error" -> {
                            _error_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.readValueAs(Boolean::class.java);
                            _error_set = true
                            }
                    "errorMessage" -> {
                            _errorMessage_ = if(currentToken == JsonToken.VALUE_NULL) null
                             else p.text;
                            _errorMessage_set = true
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
            return if(_applicationId_set && _language_set && _type_set && _intentId_set &&
                    _entityTypeName_set && _nbSentences_set && _duration_set && _error_set &&
                    _errorMessage_set && _date_set)
                    ModelBuild(applicationId = _applicationId_!!, language = _language_!!, type =
                            _type_!!, intentId = _intentId_, entityTypeName = _entityTypeName_,
                            nbSentences = _nbSentences_!!, duration = _duration_!!, error =
                            _error_!!, errorMessage = _errorMessage_, date = _date_!!)
                    else {
                    val map = mutableMapOf<KParameter, Any?>()
                    if(_applicationId_set)
                    map[parameters.getValue("applicationId")] = _applicationId_
                    if(_language_set)
                    map[parameters.getValue("language")] = _language_
                    if(_type_set)
                    map[parameters.getValue("type")] = _type_
                    if(_intentId_set)
                    map[parameters.getValue("intentId")] = _intentId_
                    if(_entityTypeName_set)
                    map[parameters.getValue("entityTypeName")] = _entityTypeName_
                    if(_nbSentences_set)
                    map[parameters.getValue("nbSentences")] = _nbSentences_
                    if(_duration_set)
                    map[parameters.getValue("duration")] = _duration_
                    if(_error_set)
                    map[parameters.getValue("error")] = _error_
                    if(_errorMessage_set)
                    map[parameters.getValue("errorMessage")] = _errorMessage_
                    if(_date_set)
                    map[parameters.getValue("date")] = _date_ 
                    primaryConstructor.callBy(map) 
                    }
        } 
    }

    companion object {
        private val primaryConstructor: KFunction<ModelBuild> by
                lazy(LazyThreadSafetyMode.PUBLICATION) { ModelBuild::class.primaryConstructor!! }

        private val parameters: Map<String, KParameter> by lazy(LazyThreadSafetyMode.PUBLICATION) {
                kotlin.collections.mapOf("applicationId" to
                primaryConstructor.findParameterByName("applicationId")!!, "language" to
                primaryConstructor.findParameterByName("language")!!, "type" to
                primaryConstructor.findParameterByName("type")!!, "intentId" to
                primaryConstructor.findParameterByName("intentId")!!, "entityTypeName" to
                primaryConstructor.findParameterByName("entityTypeName")!!, "nbSentences" to
                primaryConstructor.findParameterByName("nbSentences")!!, "duration" to
                primaryConstructor.findParameterByName("duration")!!, "error" to
                primaryConstructor.findParameterByName("error")!!, "errorMessage" to
                primaryConstructor.findParameterByName("errorMessage")!!, "date" to
                primaryConstructor.findParameterByName("date")!!) }

        private val _applicationId__reference: TypeReference<Id<ApplicationDefinition>> = object :
                TypeReference<Id<ApplicationDefinition>>() {}

        private val _intentId__reference: TypeReference<Id<IntentDefinition>> = object :
                TypeReference<Id<IntentDefinition>>() {}
    }
}
