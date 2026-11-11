# Build the standalone GRAB VR menu APK using only your Quest browser

This project is a standalone menu-interface demo. The toggles only change their on-screen state; they do not modify GRAB VR gameplay.

## Browser-only build
1. Sign in to GitHub in the Quest browser and create a **new public repository**.
2. Extract this ZIP using the Quest file manager.
3. In the new repository, use **Add file → Upload files** and upload the project files and folders (including the hidden `.github/workflows/build-apk.yml` file).
4. Commit the uploaded files to the `main` branch.
5. Open the repository's **Actions** tab.
6. Select **Build GRAB VR Menu APK**, choose **Run workflow**, then run it.
7. When the run finishes successfully, open the run and download the **GRAB-VR-Menu-APK** artifact.
8. Extract the downloaded artifact to get the APK.

GitHub Actions builds the Android APK on GitHub's hosted runner, so Android Studio or a PC is not needed for the build itself. GitHub account access and uploading the source project are still required.

## Important
This APK is only a standalone UI demo. It is not an in-game GRAB mod and its switches do not affect the game.
