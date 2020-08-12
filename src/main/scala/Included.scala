package ant
package informations

object included {

  var fullCodeIsHere:String = _

  def LoveTheseThings(lovelyThings:LovelyThing*) = lovelyThings.toList
  def VeryConfortableWith(langs:ProgrammingLanguage*) = langs.toList
  def UseRegularly(langs:ProgrammingLanguage*) = langs.toList
  def Learning(langs:ProgrammingLanguage*) = langs.toList
  def IUseInThePastButIWantToForget(langs:ProgrammingLanguage*) = langs.toList
  def BlowedUpMyMynd(langs:ProgrammingLanguage*) = langs.toList
  def MathyThings(langs:TechnicalInterest*) = langs.toList
  def MicroservicesStuff(langs:TechnicalInterest*) = langs.toList
  def Sports(langs:NotProgramming*) = langs.toList
  def TonOfMusic(langs:NotProgramming*) = langs.toList
  def ILovePraticing(langs:List[NotProgramming]*) = langs.flatten.toList
  def ILoveListening(langs:List[NotProgramming]*) = langs.flatten.toList

  sealed trait LovelyThing
  object FunctionalProgramming extends  LovelyThing
  object TypeSystems extends  LovelyThing
  object Compilers extends  LovelyThing

  object TheEarly90s

  sealed trait ProgrammingLanguage
  object Scala extends ProgrammingLanguage
  object Purescript extends ProgrammingLanguage
  object Haskell extends ProgrammingLanguage
  object Java extends ProgrammingLanguage
  object Typescript extends ProgrammingLanguage
  object Javascript extends ProgrammingLanguage
  object Python extends ProgrammingLanguage
  object C extends ProgrammingLanguage
  object Idris extends ProgrammingLanguage
  object Abap extends ProgrammingLanguage
  object Rust extends ProgrammingLanguage

  sealed trait TechnicalInterest
  object AbstractAlgebra extends TechnicalInterest
  object CategoryTheory extends TechnicalInterest
  object Kubernetes extends TechnicalInterest
  object HexagonalArchitecture extends TechnicalInterest
  object LambdaKappaArchitecture extends TechnicalInterest
  object WebDevelopment extends TechnicalInterest

  sealed trait NotProgramming
  object Running extends NotProgramming
  object Cycling extends NotProgramming
  object MetalThatIsNotTooBoring extends NotProgramming
  object DarkIndustrialNoise extends NotProgramming
  object ProgressiveRockWhenNotCloningGenesis extends NotProgramming
  object AmbientPsydubTechnoWeirdElectronics extends NotProgramming
  object NoiseyGanstaHipHopRap extends NotProgramming
  object OtherUncategorizedWeirdStuff extends NotProgramming

  object Zextras

  case class PassionateProgrammer(
                                 name:String,
                                 age:Int,
                                 programmingSince: TheEarly90s.type,
                                 mainInterests:List[LovelyThing],
                                 programminLanguages:List[ProgrammingLanguage],
                                 imSortOfInterestedIn:List[TechnicalInterest],
                                 whenNotProgramming:List[NotProgramming],
                                 loveCats: SureGoodPeopleLoveCats.type,
                                 butIAlsoLoveDogs: Boolean,
                                 gladImWorkingFor:Zextras.type
                                 )

  object SureGoodPeopleLoveCats
  def sureGoodPeopleLoveCats = SureGoodPeopleLoveCats

  def onlyUsefullProgramsPerformSideEffects() = {

  }
}