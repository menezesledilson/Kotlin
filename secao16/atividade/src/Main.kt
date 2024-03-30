fun main() {
    println(Role.ADMIN.level)
}

enum class Role(val level: Level) {
    USER(Level.BASIC),
    MODETOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun canDelete() =this == Role.ADMIN
}

enum class Level {
    BASIC, MEDIUM, HIGH
}