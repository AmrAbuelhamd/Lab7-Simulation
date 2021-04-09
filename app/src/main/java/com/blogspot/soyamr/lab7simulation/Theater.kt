package com.blogspot.soyamr.lab7simulation

import kotlin.random.Random

object Theater {

    private var salary = 0

    private val stuffAmount = Random.nextInt(50, 300)
    private val stuffCost = Random.nextInt(500, 1000)
    private var actorAmount = 0
    private val extraSpending = Random.nextInt(10000, 100000)
    private val qualityCoef = Random.nextInt(5000, 10000)

    private var customersAmount = 0
    private var mark = 0
    private var performanceQuality = 0
    private var stuffSpending = 0
    private var actorsSpending = 0
    private var ticketCost = 0
    private var ticketProfit = 0
    private var actorsCost = 0

    var profit = 0
    var spending = 0


    fun calculate() {
        actorAmount = Random.nextInt(1, numberOfActors)
        if ((budget / qualityCoef) > 10)
            performanceQuality = 10
        else
            performanceQuality = budget / qualityCoef

        mark = performanceQuality / 2

        customersAmount = Random.nextInt(10, 100) * mark;

        salary = budget / numberOfActors
        stuffSpending = stuffAmount * stuffCost
        actorsSpending = actorAmount * salary
        ticketCost = (stuffSpending + actorsSpending + extraSpending) / customersAmount
        ticketProfit = numberOfTickets * ticketCost
        actorsCost = numberOfActors * salary


        profit = budget + ticketProfit
        spending = actorsCost + extraSpending + stuffSpending
    }

    var numberOfActors = 0
        private set
    var budget = 0;
    fun hire() {
        numberOfActors++;
    }

    fun fire() {
        numberOfActors--;
        if (numberOfActors <= 0)
            numberOfActors = 0;
    }

    var numberOfTickets = 0

    fun invoke(): Theater {
        return this
    }


}