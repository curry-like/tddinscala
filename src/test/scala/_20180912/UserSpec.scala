package _20180912

import org.scalatest.{FlatSpec, FreeSpec}

class UserSpec extends FreeSpec {

 "User" - {

  "instance" - {
   "can set name" in {
    val user = User("Taro", "Bizreach", "hoeg@example.com", "password")
    assert(user.name == "Taro")
   }
  }

  "validation" - {

   "Password must be 8 characters min" in {
    val user = User("Taro", "Bizreach", "hoeg@example.com", "password")
    assert(user.isValid == true)
   }

   "User with invalid password" in {
    val user = User("Taro", "Bizreach", "hoeg@example.com", "pa")
    assert(user.isValid == false)
   }
  }

  "company" - {
   "can get signature" in {
    val user = User("Taro", "Bizreach", "hoeg@example.com", "password")
    assert(user.getSignature == "Bizreach:Taro OK")
   }

   "can get signature for name" in {
    val user = User("Taro", "", "hoeg@example.com", "password")
    assert(user.getSignature == "Taro OK")
   }

   "can get signature validation ng" in {
    val user = User("Taro", "", "hoeg@example.com", "pa")
    assert(user.getSignature == "Taro NG")
   }

  }
 }
}

