import ant.informations.included._

object Presentation {

  val `Giovanni De Facci` = PassionateProgrammer(
    name = "Giovanni De Facci",
    age = 43,
    programmingSince = TheEarly90s,
    mainInterests = LoveTheseThings(
      FunctionalProgramming,
      TypeSystems,
      Compilers
    ),
    programminLanguages = VeryConfortableWith(
      Scala,
      Purescript,
      Haskell
    ) ++ UseRegularly(
      Java,
      Typescript
    ) ++ BlowedUpMyMynd(
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
      TonOfMusic(
        MetalThatIsNotTooBoring,
        DarkIndustrialNoise,
        ProgressiveRockWhenNotCloningGenesis,
        AmbientPsydubTechnoWeirdElectronics,
        NoiseyGanstaHipHopRap,
        OtherUncategorizedWeirdStuff
      )
    ),
    loveCats = sureGoodPeopleLoveCats,
    butIAlsoLoveDogs = true,
    gladImWorkingFor = Zextras
  )

  def main(args: Array[String]): Unit = {
    onlyUsefullProgramsPerformSideEffects()
  }

  fullCodeIsHere = "https://github.com/zextrasGiovanniDefacci/presentation"

}

