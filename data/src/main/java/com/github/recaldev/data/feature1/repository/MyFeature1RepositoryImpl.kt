package com.github.recaldev.data.feature1.repository

import com.github.recaldev.data.feature1.datasource.MyFeature1DataSource
import com.github.recaldev.domain.feature1.contracts.repository.MyFeature1Repository

class MyFeature1RepositoryImpl(
    private val myFeature1DataSource: MyFeature1DataSource
) : MyFeature1Repository {

    override fun get() = myFeature1DataSource.get()
}