import ant.informations.included._

object Presentation {

  val `Giovanni De Facci` = PassionateProgrammer(
    name = "Giovanni De Facci",
    age = 43,
    recentPhoto = Url("https://en.wikipedia.org/wiki/Lambda#/media/File:Greek_lc_lamda_thin.svg"),
    programmingSince = TheEarly90s,
    mainInterests = LoveTheseThings(
      FunctionalProgramming,
      TypeSystems,
      Compilers
    ),
    programmingLanguages = VeryConfortableWith(
      Scala,
      Purescript,
      Haskell
    ) ++ UseRegularly(
      Java,
      Typescript
    ) ++ BlowedUpMyMind(
      Idris
    ) ++ Learning(
      Rust
    ) ++ IUseInThePastButIWantToForget(
      Javascript,
      Python,
      C,
      Abap
    ),
    imSortOfInterestedIn = MathyThings(
      AbstractAlgebra,
      CategoryTheory
    ) ++ MicroservicesStuff(
      Kubernetes,
      HexagonalArchitecture,
      LambdaKappaArchitecture
    ) :+
      WebDevelopment,
    whenNotProgramming = ILovePraticing(
      Sports(
        Running,
        Cycling
      )
    ) ++ ILoveListening(
      TonsOfMusic(
        MetalThatIsNotTooBoring,
        DarkIndustrialNoise,
        ProgressiveRockWhenNotCloningGenesis,
        AmbientPsyDubTechnoWeirdElectronics,
        NoisyGangstaHipHopRap,
        OtherUncategorizedWeirdStuff
      )
    ),
    definitivelyNotInterestedIn = BoringThings(
      Politics,
      Football,
      DynamicProgrammingLanguages,
      TvCinemaNetflixPokemonsStarWars,
      SportsWatching,
      TooConventionalMusic
    ),
    loveCats = sureGoodPeopleLoveCats,
    butIAlsoLoveDogs = true,
    gladImWorkingFor = Zextras
  )

  def main(args: Array[String]): Unit = {
    onlyUsefulProgramsPerformSideEffects()
  }

  submitYourPullRequest = Url("https://github.com/zextrasGiovanniDefacci/presentation")

}

