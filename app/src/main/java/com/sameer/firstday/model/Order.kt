package com.sameer.firstday.model

data class Order(
    val qty : Int,
    val orderDetails: List<OrderDetail>
)
