package co.anitrend.support.sync.plugin.core

/**
 * Supported platform contract
 */
interface ISyncPlatform {
    val id: Long
    val progress: Int
}