package com.github.recaldev.domain.feature1.usecases

import com.github.recaldev.domain.feature1.contracts.MyFeature1UseCase
import com.github.recaldev.domain.feature1.contracts.repository.MyFeature1Repository

class MyFeature1UseCaseImpl(
    private val myFeature1Repository: MyFeature1Repository
) : MyFeature1UseCase {

    override fun invoke() = myFeature1Repository.get()
}