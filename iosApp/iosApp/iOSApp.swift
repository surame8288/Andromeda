import SwiftUI

@main
struct iOSApp: App {
    init() {
        DependencyProviderKt.doInitKoin()
    }
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}