func applicationWillResignActive(_ application: UIApplication) {
    // Do something agitating here, for example, play an irritating sound
    let systemSoundID: SystemSoundID = 1005
    AudioServicesPlaySystemSound(systemSoundID)
}
