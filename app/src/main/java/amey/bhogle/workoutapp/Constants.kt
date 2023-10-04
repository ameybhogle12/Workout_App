package amey.bhogle.workoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val skipping = ExerciseModel(1,"Skipping",R.drawable.skipping, false,false)
        exerciseList.add(skipping)

        val squatjumps = ExerciseModel(2, "Squat Jumps", R.drawable.squatjumps, false,false)
        exerciseList.add(squatjumps)

        val pushups = ExerciseModel(3, "Push Ups", R.drawable.pushups, false,false)
        exerciseList.add(pushups)

        val crunches = ExerciseModel(4, "Crunches", R.drawable.crunches, false, false)
        exerciseList.add(crunches)

        val sidecrunches = ExerciseModel(5, "Side Crunches", R.drawable.sidecruches,false, false)
        exerciseList.add(sidecrunches)


        return exerciseList
    }
}