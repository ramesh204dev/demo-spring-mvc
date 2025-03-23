# Spring Boot Profiles Demo

This project demonstrates how to use **Spring Boot Profiles** for different environments (dev, prod).

## 🚀 Features
- Profile-specific configurations (`application-dev.properties`, `application-prod.properties`)
- Conditional bean creation with `@Profile`
- LiveReload and DevTools support
- REST API to display active profile details

## 📦 Prerequisites
- Java 17+
- Maven 3.8+
- IntelliJ IDEA or VS Code (recommended)
- H2 database

3️⃣ Configure IntelliJ for Automatic Compilation
Spring Boot only restarts when it detects class changes. To ensure IntelliJ properly compiles modified files:

✅ Enable Automatic Compilation
Open IntelliJ IDEA.

Go to File → Settings (Ctrl + Alt + S on Windows/Linux, Cmd + , on macOS).

Navigate to Build, Execution, Deployment → Compiler.

Enable ✅ Build project automatically.

✅ Enable Auto Make (for Immediate Changes)
Open IntelliJ settings.

Go to Advanced Settings.

Under Compiler, enable:

vbnet
Copy
Edit
Allow auto-make to start even if developed application is currently running
Apply changes.
