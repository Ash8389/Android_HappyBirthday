private fun pickupOptions(): String {
    val formatter = SimpleDateFormat("MMM d", Locale.getDefault())
    val calendar = Calendar.getInstance()

    val date =  formatter.format(calendar.time)

    println("date is $date")

    return date
}
fun main() {
    pickupOptions()
}