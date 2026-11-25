# SPEAR CLIENT — Minecraft 26.3

A client-side Fabric project foundation for a red-and-gold Minecraft utility client.

## Planned client-side features
- Right Shift ClickGUI
- FPS / CPS / keystrokes HUD
- Coordinates and armor HUD
- Zoom
- Toggle Sprint
- HUD layout and theme settings

This starter foundation currently registers the client mod and logs a startup message.
The planned HUD and GUI features still need to be implemented and tested against the
26.3 client API before this should be described as a finished client.

## Build
Requires JDK 25 and Gradle. From this folder run:

```bash
gradle build
```

The JAR will be in `build/libs/`.

## GitHub automatic build
Push this project to a GitHub repository. The workflow in
`.github/workflows/build.yml` builds it on each push and uploads the JAR
as a workflow artifact.

## Install
After building, place the mod JAR in the `mods` folder of a Minecraft 26.3
Fabric profile. Fabric Loader and a matching Fabric API are required.

SPEAR CLIENT is client-side only; the server does not need this mod.
