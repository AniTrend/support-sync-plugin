package co.anitrend.support.sync.plugin.platforms.mal

import co.anitrend.support.sync.plugin.core.ISyncPlatform

data class MalPlatform(
    override val id: Long,
    override val progress: Int
) : ISyncPlatform