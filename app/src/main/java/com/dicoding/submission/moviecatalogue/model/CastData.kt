package com.dicoding.submission.moviecatalogue.model

object CastData {

    private val listCastAStarIsBorn = arrayListOf(
        Cast(name = "Lady Gaga", character = "Ally Campana"),
        Cast(name = "Bradley Cooper", character = "Jackson Maine"),
        Cast(name = "Sam Elliott", character = "Bobby Maine"),
        Cast(name = "Andrew Dice Clay", character = "Lorenzo Campana"),
        Cast(name = "Ravi Gavron", character = "Rez Gavron")
    )

    private val listCastAquaman = arrayListOf(
        Cast(name = "Jason Momoa", character = "Arthur Curry / Aquaman"),
        Cast(name = "Amber Heard", character = "Mera"),
        Cast(name = "Willem Dafoe", character = "Nuidis Vulko"),
        Cast(name = "Patrick Wilson", character = "King Orm Marius / Ocean Master"),
        Cast(name = "Nicole Kidman", character = "Atlanna")
    )

    private val listCastAvenger = arrayListOf(
        Cast(name = "Robert Downey Jr.", character = "Tony Stark / Iron Man"),
        Cast(name = "Chris Hemsworth", character = "Thor Odinson"),
        Cast(name = "Chris Evans", character = "Steve Rogers / Captain America"),
        Cast(name = "Mark Ruffalo", character = "Bruce Banner / The Hulk"),
        Cast(name = "Scarlett Johansson", character = "Natasha Romanoff / Black Widow")
    )

    private val listCastBirdBox = arrayListOf(
        Cast(name = "Sandra Bullock", character = "Malorie Hayes"),
        Cast(name = "Trevante Rhodes", character = "Tom"),
        Cast(name = "John Malkovich", character = "Douglas"),
        Cast(name = "Sarah Paulson", character = "Jessica"),
        Cast(name = "Jacki Weaver", character = "Cheryl")
    )

    private val listCastBohemianRhapsody = arrayListOf(
        Cast(name = "Rami Malek", character = "Freddie Mercury"),
        Cast(name = "Gwilym Lee", character = "Brian May"),
        Cast(name = "Ben Hardy", character = "Roger Taylor"),
        Cast(name = "Joseph Mazzello", character = "John Deacon"),
        Cast(name = "Lucy Boynton", character = "Mary Austin")
    )

    private val listCastBumblebee = arrayListOf(
        Cast(name = "Hailee Steinfeld", character = "Charlie Watson"),
        Cast(name = "Jorge Lendeborg Jr.", character = "Memo"),
        Cast(name = "John Cena", character = "Agent Jack Burns"),
        Cast(name = "Jason Ian Drucker", character = "Otis Watson"),
        Cast(name = "Pamela Adlon", character = "Sally Watson")
    )

    private val listCastCreed = arrayListOf(
        Cast(name = "Michael B. Jordan", character = "Adonis Creed"),
        Cast(name = "Sylvester Stallone", character = "Robert \"Rocky\" Balboa Sr."),
        Cast(name = "Dolph Lundgren", character = "Ivan Drago"),
        Cast(name = "Florian Munteanu", character = "Viktor Drago"),
        Cast(name = "Tessa Thompson", character = "Bianca Taylor")
    )


    private val listOfAllCast = arrayOf(
        listCastAStarIsBorn,
        listCastAquaman,
        listCastAvenger,
        listCastBirdBox,
        listCastBohemianRhapsody,
        listCastBumblebee,
        listCastCreed
    )

    fun getListOfCast(position: Int) : ArrayList<Cast>{
        return listOfAllCast[position]
    }
}