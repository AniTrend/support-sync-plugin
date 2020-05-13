package co.anitrend.support.sync.plugin.model

/**
 * Support request helper for executed requests
 *
 * @property id Identification key the request
 * @property entityId Identification for the requested resource
 * @property lastExecutedOn last timestamp the resource was requested
 */
interface ISyncLastRequest<E> {
    val id: Long
    val entityId: E
    val lastExecutedOn: Long

    /**
     * Checks if the [lastExecutedOn] has elapsed a certain duration if so then
     * true is returned, otherwise false
     */
    fun hasExpired(lastRequest: ISyncLastRequest<E>): Boolean
}