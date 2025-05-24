package us.timinc.mc.cobblemon.Mod

@Mod(Mod.MOD_ID)
object Mod {
    const val MOD_ID = "mod_id"

    @Suppress("MemberVisibilityCanBePrivate")
    var config: ModConfig = ConfigBuilder.load(ModConfig::class.java, MOD_ID)
    var eventsListening = false

    @EventBusSubscriber()
    object Registration {
        @SubscribeEvent
        fun onInit(e: ServerStartedEvent) {
            if (eventsListening) return
            eventsListening = true
            // Register your Cobblemon events here.
        }
    }
}