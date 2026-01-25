plugins {
    id("java")
}

// 对应 Groovy 的 ext
//val javaVersion = "1.8"
val flinkVersion = "1.20.3"
//val scalaBinaryVersion = "_2.12"
//val slf4jVersion = "1.7.36"
//val log4jVersion = "2.24.3"
val arrowJavaVersion = "18.3.0"
dependencies {
    // flink
    compileOnly("org.apache.flink:flink-streaming-java:${flinkVersion}")
    compileOnly("org.apache.flink:flink-table-common:${flinkVersion}")//    compileOnly("org.apache.flink:flink-table-common:${flinkVersion}")

    // arrow
    // 核心：内存管理和向量结构 (必选)
    implementation("org.apache.arrow:arrow-vector:${arrowJavaVersion}")
    implementation("org.apache.arrow:arrow-memory-core:${arrowJavaVersion}")    // 内存管理：基于 Netty 的分配器 (必选，用于管理 Off-heap 内存)
    implementation("org.apache.arrow:arrow-memory-netty:${arrowJavaVersion}")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}