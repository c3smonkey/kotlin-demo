package ch.c3smonkey.sample.kotlin.dataclass

data class ClothingItem(private var _type: String?,
                        val size: String,
                        private var _price: Double) {

//    init {
//        _type = _type?.toUpperCase() ?: "UNKNOWN"
//    }

    var type : String? = _type
        get() = field ?: "Unknown"

    var price : Double = _price
        set(value) {
            field = value * .9 // 10% discount
        }

    constructor(size: String, price: Double) : this(null, size, price)
}