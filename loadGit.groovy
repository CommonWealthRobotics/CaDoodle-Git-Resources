import com.neuronrobotics.bowlerstudio.BowlerKernel;
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins;
import com.neuronrobotics.bowlerstudio.assets.AssetFactory;


BowlerKernel.ensureUpdated(true,
    "https://github.com/CommonWealthRobotics/BowlerStudioImageAssets.git",
    "https://github.com/CommonWealthRobotics/CaDoodle-ShapesPalet-Content.git",
    "https://github.com/CommonWealthRobotics/ExternalEditorsBowlerStudio.git",
    "https://github.com/CommonWealthRobotics/CaDoodle-Git-Resources.git",
    "https://github.com/CommonWealthRobotics/freecad-bowler-cli.git",
    "https://github.com/CommonWealthRobotics/blender-bowler-cli.git",
    "https://github.com/kennetek/gridfinity-rebuilt-openscad.git",
    "https://github.com/CommonWealthRobotics/BowlerStudioExampleRobots.git",
    AssetFactory.getGitSource(),
    "https://github.com/madhephaestus/CaDoodle-Example-Objects.git",
    "https://github.com/madhephaestus/carl-the-hexapod.git",
    Vitamins.getGitRepoDatabase(), 
    "https://github.com/CommonWealthRobotics/CaDoodle-ShapesPalet-Content.git");
Vitamins.loadAllScriptFiles();
