# Minecraft Totem Infinity Enchantment Plugin

Totem Infinity Enchantment is a Minecraft plugin that allows players to apply the Infinity enchantment to Totems of Undying using enchanting tables and anvils. It extends the standard enchanting experience by allowing totems to receive the vanilla Infinity enchantment, with separate permission checks for enchanting table and anvil usage.

## Install

1. Download or build the TotemInfinity plugin JAR.
2. Make sure your server is running Minecraft 1.21 or a compatible server implementation.
3. Place the JAR file into your server's `plugins` directory.
4. Restart your Minecraft server.
5. Grant the appropriate permissions to players using your permissions management plugin:
   - `toteminfinity.enchant` – Allows players to apply Infinity to totems through enchanting tables.
   - `toteminfinity.anvil` – Allows players to apply Infinity to totems through anvils.
6. Check the server console to ensure the plugin loads successfully.

## Use

**Enchanting Table**

1. Obtain a Totem of Undying.
2. Place the totem in an enchanting table.
3. Enchant it while having the `toteminfinity.enchant` permission.
4. The plugin applies the vanilla Infinity enchantment to the totem when the enchanting event occurs.

**Anvil**

1. Obtain a Totem of Undying and place it in an anvil setup that produces a totem as its result.
2. Use the anvil while having the `toteminfinity.anvil` permission.
3. The plugin adds the vanilla Infinity enchantment to the resulting totem.

Players without the required permission cannot use the corresponding plugin functionality.

---

More Minecraft plugin projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/6a716f81-c1db-4995-b4b2-d21262b47414?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=6a716f81-c1db-4995-b4b2-d21262b47414
