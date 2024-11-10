package org.example.lesson19

class SlotMachine(
    val color: String,
    val model: String,
    private var isPoweredOn: Boolean = false,
    private var isOsLoaded: Boolean = false,
    val availableGames: List<String> = listOf(),
    val hasJoystick: Boolean,
    private var balance: Double = 0.0,
    val owner: String,
    val supportPhoneNumber: String
) {
    fun powerOn() { isPoweredOn = true }
    fun powerOff() { isPoweredOn = false; isOsLoaded = false }
    fun loadOs() { if (isPoweredOn) isOsLoaded = true }
    fun shutdownOs() { isOsLoaded = false }
    fun showAvailableGames(): List<String> = availableGames
    fun startGame(gameName: String): Boolean = isOsLoaded && availableGames.contains(gameName)
    fun payForSession(amount: Double) { balance += amount }

    private fun openSafeAndDispenseCash(amount: Double): Boolean {
        return if (amount <= balance) { balance -= amount; true } else false
    }

    fun dispenseWinnings(amount: Double): Boolean = openSafeAndDispenseCash(amount)
}
