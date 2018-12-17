package nikan.sravni.ru.exchangerate

import nikan.sravni.ru.domain.exchangerate.entity.Rate

data class ExcangeRatesForView(val code: String,
                               val name: String,
                               val curRate: Float ){
    constructor(domainRate: Rate): this(domainRate.code, domainRate.name, domainRate.curRate)
}