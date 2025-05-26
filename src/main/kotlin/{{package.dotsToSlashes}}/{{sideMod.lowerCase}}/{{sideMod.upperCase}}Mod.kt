package {{package.original}}.{{sideMod.lowerCase}}

import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.fml.common.Mod
import {{package.original}}.{{sideMod.lowerCase}}.config.ConfigBuilder
import {{package.original}}.{{sideMod.lowerCase}}.config.{{sideMod.upperCase}}Config

@Mod({{sideMod.upperCase}}Mod.MOD_ID)
object {{sideMod.upperCase}}Mod {
    const val MOD_ID = "{{sideMod.snakeCase}}"

    @Suppress("MemberVisibilityCanBePrivate")
    var config: {{sideMod.upperCase}}Config = ConfigBuilder.load({{sideMod.upperCase}}Config::class.java, MOD_ID)

    @EventBusSubscriber()
    object Registration {
    }
}