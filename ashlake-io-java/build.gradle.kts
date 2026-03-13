plugins {
    id("java-library")
}

val arrowJavaVersion = "18.3.0"

dependencies {
    // arrow
// 核心：内存管理和向量结构 (必选)
    api("org.apache.arrow:arrow-vector:${arrowJavaVersion}")
    api("org.apache.arrow:arrow-memory-core:${arrowJavaVersion}")
// 内存管理：基于 Netty 的分配器 (必选，用于管理 Off-heap 内存)
    api("org.apache.arrow:arrow-memory-netty:${arrowJavaVersion}")

    implementation("com.github.jnr:jnr-ffi:2.2.18")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}