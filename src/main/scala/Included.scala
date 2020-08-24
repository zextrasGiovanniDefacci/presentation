package ant
package informations

object included {

  case class Url(url:String)

  var submitYourPullRequest:Url = _

  def LoveTheseThings(lovelyThings:LovelyThing*) = lovelyThings.toList
  def VeryConfortableWith(langs:ProgrammingLanguage*) = langs.toList
  def UseRegularly(langs:ProgrammingLanguage*) = langs.toList
  def Learning(langs:ProgrammingLanguage*) = langs.toList
  def IUseInThePastButIWantToForget(langs:ProgrammingLanguage*) = langs.toList
  def BlowedUpMyMind(langs:ProgrammingLanguage*) = langs.toList
  def MathyThings(interest:TechnicalInterest*) = interest.toList
  def MicroservicesStuff(interest:TechnicalInterest*) = interest.toList
  def Sports(things:NotProgramming*) = things.toList
  def TonsOfMusic(things:NotProgramming*) = things.toList
  def ILovePraticing(things:List[NotProgramming]*) = things.flatten.toList
  def ILoveListening(things:List[NotProgramming]*) = things.flatten.toList
  def BoringThings(things:BoringThing*) = things.toList

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
  object AmbientPsyDubTechnoWeirdElectronics extends NotProgramming
  object NoisyGangstaHipHopRap extends NotProgramming
  object OtherUncategorizedWeirdStuff extends NotProgramming

  sealed trait BoringThing
  object Politics extends BoringThing
  object Football extends BoringThing
  object DynamicProgrammingLanguages extends BoringThing
  object TvCinemaNetflixPokemonsStarWars extends BoringThing
  object SportsWatching extends BoringThing
  object TooConventionalMusic extends BoringThing

  object Zextras

  case class PassionateProgrammer(
                                   name:String,
                                   age:Int,
                                   recentPhoto:Url,
                                   programmingSince: TheEarly90s.type,
                                   mainInterests:List[LovelyThing],
                                   programmingLanguages:List[ProgrammingLanguage],
                                   imSortOfInterestedIn:List[TechnicalInterest],
                                   whenNotProgramming:List[NotProgramming],
                                   definitivelyNotInterestedIn:List[BoringThing],
                                   loveCats: SureGoodPeopleLoveCats.type,
                                   butIAlsoLoveDogs: Boolean,
                                   gladImWorkingFor:Zextras.type
                                 )

  object SureGoodPeopleLoveCats
  def sureGoodPeopleLoveCats: SureGoodPeopleLoveCats.type = SureGoodPeopleLoveCats

  def onlyUsefulProgramsPerformSideEffects() = {
  }
}