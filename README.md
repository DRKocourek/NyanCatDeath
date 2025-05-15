# NyanCatDeath
A Spigot plugin that plays nyan cat sound effect to a player that dies on the server with this plugin

## Installation

1. Download [PaperMC](https://api.papermc.io/v2/projects/paper/versions/1.21.4/builds/226/downloads/paper-1.21.4-226.jar)
2. Create a folder and insert the installed .jar file into it
3. Create a file called "run.bat" and insert following content into it:
`java -Xmx1G -jar <filename of the file you downloaded file>.jar nogui `<br>`
PAUSE`
4. Run run.bat, wait for a while until it says done or similar then close the window
5. Download the [latest full version of the plugin](https://github.com/DRKocourek/NyanCatDeath/releases/tag/Full) and insert it into the newly created folder called `plugins`
6. Open file called eula.txt and change it's content from `eula=false` to `eula=true`
7. Open `server.properties` file and change the following content from <br>
`require-resource-pack=false`<br>`
resource-pack=`<br>`
resource-pack-id=`<br>`
resource-pack-prompt= `<br>`
resource-pack-sha1= `<br>
to  <br> 
`require-resource-pack=true `<br>
`resource-pack=https\://github.com/DRKocourek/NyanCatDeath/raw/refs/heads/main/NyanCatSoundEffect.zip  `<br>
`resource-pack-id= `<br>`
resource-pack-prompt=The resource pack is needed for a special death sound effect via a server plugin ({"text"\:"More info here","color"\:"\#00ff8d","clickEvent"\:{"action"\:"open_url","value"\:"https\://github.com/DRKocourek/NyanCatDeath"}})  `<br>`
resource-pack-sha1=dc6332d1811b20407a0c1c3c514376b7516a812c`
8.  Then just start the `run.bat` file again start Minecraft 1.21.4 and connect to server with address `localhost` and if everything works properly you should be able to hear the nyan cat on death :)) 

## Issues
Please report issues [here](https://github.com/DRKocourek/NyanCatDeath/issues/new) **with label `bug` only for bugs and errors** use other tags appropriately. 
**Wrongly tagged issues will propably be ignored!**

## Support me
View my [linktree](https://drkocourek.stream/linktree) for my social media
<br>
You can also support me on Ko-Fi 
<br>
[![ko-fi](https://ko-fi.com/img/githubbutton_sm.svg)](https://ko-fi.com/E1E51F13U0)
