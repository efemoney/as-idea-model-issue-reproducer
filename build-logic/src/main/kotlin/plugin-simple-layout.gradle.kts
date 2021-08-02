import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

pluginManager.withPlugin("android") {
  the<BaseExtension>().sourceSets.configureEach {
    manifest.srcFile(simpleName(name, "AndroidManifest.xml"))
    java.setSrcDirs(listOf(simpleName(name, "src")))
    res.setSrcDirs(listOf(simpleName(name, "res")))
    resources.setSrcDirs(listOf(simpleName(name, "resources")))
    assets.setSrcDirs(listOf(simpleName(name, "assets")))
    aidl.setSrcDirs(listOf(simpleName(name, "aidl")))
    renderscript.setSrcDirs(listOf(simpleName(name, "renderscript")))
    jniLibs.setSrcDirs(listOf(simpleName(name, "jniLibs")))
    shaders.setSrcDirs(listOf(simpleName(name, "shaders")))
    mlModels.setSrcDirs(listOf(simpleName(name, "mlModels")))
  }
}

pluginManager.withPlugin("android-library") {
  the<BaseExtension>().sourceSets.configureEach {
    manifest.srcFile(simpleName(name, "AndroidManifest.xml"))
    java.setSrcDirs(listOf(simpleName(name, "src")))
    res.setSrcDirs(listOf(simpleName(name, "res")))
    resources.setSrcDirs(listOf(simpleName(name, "resources")))
    assets.setSrcDirs(listOf(simpleName(name, "assets")))
    aidl.setSrcDirs(listOf(simpleName(name, "aidl")))
    renderscript.setSrcDirs(listOf(simpleName(name, "renderscript")))
    jniLibs.setSrcDirs(listOf(simpleName(name, "jniLibs")))
    shaders.setSrcDirs(listOf(simpleName(name, "shaders")))
    mlModels.setSrcDirs(listOf(simpleName(name, "mlModels")))
  }
}

pluginManager.withPlugin("java") {
  the<JavaPluginConvention>().sourceSets.configureEach {
    resources.setSrcDirs(listOf(simpleName(name, "resources")))
    java.setSrcDirs(listOf(simpleName(name, "src")))
  }
}

pluginManager.withPlugin("kotlin") {
  the<SourceSetContainer>().configureEach {
    withConvention(KotlinSourceSet::class) {
      kotlin.setSrcDirs(listOf(simpleName(name, "src")))
      resources.setSrcDirs(listOf(simpleName(name, "resources")))
    }
  }
}

fun simpleName(name: String, suffix: String) = if (name == "main") suffix else "$name-$suffix"
