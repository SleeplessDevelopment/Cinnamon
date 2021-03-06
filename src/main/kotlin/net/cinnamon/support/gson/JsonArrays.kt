@file:JvmName("JsonArrays")
@file:Suppress("NOTHING_TO_INLINE")

package net.cinnamon.support.gson

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonNull
import org.jetbrains.annotations.Nullable

/**
 * Creates a new empty [JsonArray]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf() = JsonArray()

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Any?) = JsonArray().also {
    for (obj in values) when (obj) {
        null -> it.add(JsonNull.INSTANCE)
        is Boolean -> it.add(obj)
        is Char -> it.add(obj)
        is Number -> it.add(obj)
        is String -> it.add(obj)
        is JsonElement -> it.add(obj)
        else -> error("Unsupported type $obj for JsonArray")
    }
}

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Boolean?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Double?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Float?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Long?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Int?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Char?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Short?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: Byte?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: String?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArray")
fun jsonArrayOf(@Nullable vararg values: JsonElement?) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(@Nullable values: Array<out Any?>) = JsonArray().also {
    for (obj in values) when (obj) {
        null -> it.add(JsonNull.INSTANCE)
        is Boolean -> it.add(obj)
        is Char -> it.add(obj)
        is Number -> it.add(obj)
        is String -> it.add(obj)
        is JsonElement -> it.add(obj)
        else -> error("Unsupported type $obj for JsonArray")
    }
}

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: BooleanArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: DoubleArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: FloatArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: LongArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: IntArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: CharArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: ShortArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: ByteArray) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: Array<String>) = JsonArray().also { values.forEach(it::add) }

/**
 * Creates a new [JsonArray] populated with the given [values]
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmName("newJsonArrayKt")
@JvmSynthetic
fun jsonArrayOf(values: Array<JsonElement>) = JsonArray().also { values.forEach(it::add) }

/**
 * Converts the BooleanArray receiver to a [JsonArray] of Booleans
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun BooleanArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the DoubleArray receiver to a [JsonArray] of Doubles
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun DoubleArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the FloatArray receiver to a [JsonArray] of Floats
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun FloatArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the LongArray receiver to a [JsonArray] of Longs
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun LongArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the IntArray receiver to a [JsonArray] of Ints
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun IntArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the CharArray receiver to a [JsonArray] of Chars
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun CharArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the ShortArray receiver to a [JsonArray] of Shorts
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun ShortArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the ByteArray receiver to a [JsonArray] of Bytes
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun ByteArray.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the Array<String> receiver to a [JsonArray] of Strings
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun Array<String>.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the Array<JsonElement> receiver to a [JsonArray] of JsonElements
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun Array<JsonElement>.toJsonArray() = jsonArrayOf(this)

/**
 * Converts the Array<*> receiver to a [JsonArray] of JsonElements
 * @author InsomniaKitten
 * @since 0.1.0
 */
@JvmSynthetic
inline fun Array<*>.toJsonArray() = jsonArrayOf(this)

/**
 * Flattens the Array of JsonArrays into an Array of JsonElements
 * @return an Array of JsonElements collected from the JsonArrays
 * @author InsomniaKitten
 * @since 0.1.0
 */
fun Array<JsonArray>.flatten() = flatMap { it }.toTypedArray()
