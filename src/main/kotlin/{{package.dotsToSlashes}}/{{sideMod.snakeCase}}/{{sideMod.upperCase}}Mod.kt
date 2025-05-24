package {{package.original}}.Mod

@Mod(Mod.MOD_ID)
object {{sideMod.upperCase}}Mod {
    const val MOD_ID = "{{sideMod.snakeCase}}"

    @Suppress("MemberVisibilityCanBePrivate")
    var config: {{sideMod.upperCase}}Config = ConfigBuilder.load({{sideMod.upperCase}}Config::class.java, MOD_ID)

    @EventBusSubscriber()
    object Registration {
    }
}