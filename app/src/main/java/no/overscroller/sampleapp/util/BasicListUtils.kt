package no.overscroller.sampleapp.util

import no.overscroller.sampleapp.R
import java.util.*

fun String.asAnimalResource() = when (this.toLowerCase(Locale.ROOT)) {
    "ant" -> R.drawable.ant
    "badger" -> R.drawable.badger
    "bat" -> R.drawable.bat
    "bear" -> R.drawable.bear
    "bird" -> R.drawable.bird
    "blowfish" -> R.drawable.blowfish
    "boar" -> R.drawable.boar
    "bug" -> R.drawable.bug
    "butterfly" -> R.drawable.butterfly
    "camel" -> R.drawable.camel
    "cat" -> R.drawable.cat
    "chicken" -> R.drawable.chicken
    "chipmunk" -> R.drawable.chipmunk
    "cow" -> R.drawable.cow
    "cricket" -> R.drawable.cricket
    "crocodile" -> R.drawable.crocodile
    "deer" -> R.drawable.deer
    "dog" -> R.drawable.dog
    "dolphin" -> R.drawable.dolphin
    "dove" -> R.drawable.dove
    "dragon" -> R.drawable.dragon
    "duck" -> R.drawable.duck
    "eagle" -> R.drawable.eagle
    "elephant" -> R.drawable.elephant
    "ewe" -> R.drawable.ewe
    "fish" -> R.drawable.fish
    "flamingo" -> R.drawable.flamingo
    "fox" -> R.drawable.fox
    "frog" -> R.drawable.frog
    "giraffe" -> R.drawable.giraffe
    "goat" -> R.drawable.goat
    "gorilla" -> R.drawable.gorilla
    "hamster" -> R.drawable.hamster
    "hedgehog" -> R.drawable.hedgehog
    "hippopotamus" -> R.drawable.hippopotamus
    "honeybee" -> R.drawable.honeybee
    "horse" -> R.drawable.horse
    "kangaroo" -> R.drawable.kangaroo
    "koala" -> R.drawable.koala
    "lady beetle" -> R.drawable.lady_beetle
    "leopard" -> R.drawable.leopard
    "lion" -> R.drawable.lion
    "lizard" -> R.drawable.lizard
    "llama" -> R.drawable.llama
    "microbe" -> R.drawable.microbe
    "monkey" -> R.drawable.monkey
    "mosquito" -> R.drawable.mosquito
    "mouse" -> R.drawable.mouse
    "octopus" -> R.drawable.octopus
    "orangutan" -> R.drawable.orangutan
    "otter" -> R.drawable.otter
    "owl" -> R.drawable.owl
    "ox" -> R.drawable.ox
    "panda" -> R.drawable.panda
    "parrot" -> R.drawable.parrot
    "peacock" -> R.drawable.peacock
    "penguin" -> R.drawable.penguin
    "pig" -> R.drawable.pig
    "poodle" -> R.drawable.poodle
    "rabbit" -> R.drawable.rabbit
    "raccoon" -> R.drawable.raccoon
    "ram" -> R.drawable.ram
    "rat" -> R.drawable.rat
    "rhinoceros" -> R.drawable.rhinoceros
    "rooster" -> R.drawable.rooster
    "sauropod" -> R.drawable.sauropod
    "scorpion" -> R.drawable.scorpion
    "shark" -> R.drawable.shark
    "skunk" -> R.drawable.skunk
    "sloth" -> R.drawable.sloth
    "snail" -> R.drawable.snail
    "snake" -> R.drawable.snake
    "spider" -> R.drawable.spider
    "swan" -> R.drawable.swan
    "t-rex" -> R.drawable.t_rex
    "tiger" -> R.drawable.tiger
    "tropical fish" -> R.drawable.tropical_fish
    "turkey" -> R.drawable.turkey
    "turtle" -> R.drawable.turtle
    "unicorn" -> R.drawable.unicorn
    "water buffalo" -> R.drawable.water_buffalo
    "whale" -> R.drawable.whale
    "wolf" -> R.drawable.wolf
    "zebra" -> R.drawable.zebra
    else -> R.drawable.ant
}