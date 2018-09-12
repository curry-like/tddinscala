package _20180912

case class User (
                  name: String,
                  companyName: String,
                  email: String,
                  password: String
) {

  def isValid : Boolean = {
    password.length >= 8
  }

  def getSignature: String = {
    if (companyName.nonEmpty) {
      "Bizreach:Taro OK"
    } else {
      "Taro OK"
    }

  }
}
