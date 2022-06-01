# crescendo

Mindustry mod written in Clojure.

## Building

### Prerequisites

* [Leiningen](https://leiningen.org/#install) (>= 2.0.0)
* [JDK](https://adoptium.net/temurin/releases) (>= 8)
* [Android SDK](https://developer.android.com/studio#command-tools) (>= 26)

### Desktop

Run the following:

    $ lein uberjar

Build output should be in `target/crescendo-<version>-standalone.jar`. Copy it
to Mindustry's mods directory:

* Linux: `~/.local/share/Mindustry/mods`
* Windows: `%AppData%\Roaming\Mindustry\mods`
* MacOS: `~/Library/Application Support/Mindustry/mods`
* Steam: `steam/steamapps/common/Mindustry/mods`

### Android

**NOTE:** This mod still doesn't work on Android.

Make sure the `ANDROID_SDK_ROOT` environment variable is set to the parent
directory of where you unzipped the Android SDK command-line tools. Set it up
like below:

    android/ <-- value of ANDROID_SDK_ROOT
      cmdline-tools/
        latest/
          bin/
          lib/
          NOTICE.txt
          source.properties

Open the terminal and change directory to the Android SDK root directory. Get
the Android SDK platform and build tools (replace the version with the latest):

    $ cd $ANDROID_SDK_ROOT/cmdline-tools/latest/bin
    $ ./sdkmanager "build-tools;32.0.0" "platforms;android-32"

Add `$ANDROID_SDK_ROOT/build-tools/32.0.0` to your PATH. On Windows, replace
`$ANDROID_SDK_ROOT` with `%ANDROID_SDK_ROOT%`. Change directory to where the
project is and do the following:

    $ lein do uberjar, dex

Build output should be in `target/crescendo-<version>-android.jar`.

## License

GPL-3.0-or-later
