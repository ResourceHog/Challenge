data class Greeting(val: id, val: content: String )

@RestController
class GreetingController {
    val counter = AtomicLong()
    @GetMapping("/greeting")
    fun greeting(@requestParam(value = "name", defaultValue = "World") name: String) = 
        Greeting(counter.incrementAndGet(), "Hello, $name")
}