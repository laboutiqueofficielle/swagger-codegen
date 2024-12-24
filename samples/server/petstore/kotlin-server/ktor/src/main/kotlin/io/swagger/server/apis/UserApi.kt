/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.locations.put
import io.ktor.locations.patch
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.route

import io.swagger.server.Paths
import io.swagger.server.infrastructure.ApiPrincipal


import io.swagger.server.models.User

@KtorExperimentalLocationsAPI
fun Route.UserApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    post<Paths.createUser> {  _: Paths.createUser ->
        call.respond(HttpStatusCode.NotImplemented)

    }
    post<Paths.createUsersWithArrayInput> {  _: Paths.createUsersWithArrayInput ->
        call.respond(HttpStatusCode.NotImplemented)

    }
    post<Paths.createUsersWithListInput> {  _: Paths.createUsersWithListInput ->
        call.respond(HttpStatusCode.NotImplemented)

    }
    delete<Paths.deleteUser> {  _: Paths.deleteUser ->
        call.respond(HttpStatusCode.NotImplemented)

    }
    get<Paths.getUserByName> {  _: Paths.getUserByName ->
        val exampleContentType = "application/xml"
val exampleContentString = """<User>
  <id>123456789</id>
  <username>aeiou</username>
  <firstName>aeiou</firstName>
  <lastName>aeiou</lastName>
  <email>aeiou</email>
  <password>aeiou</password>
  <phone>aeiou</phone>
  <userStatus>123</userStatus>
</User>"""

when(exampleContentType) {
    "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
    else -> call.respondText(exampleContentString)
}

    }
    get<Paths.loginUser> {  _: Paths.loginUser ->
        val exampleContentType = "application/xml"
val exampleContentString = """aeiou"""

when(exampleContentType) {
    "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
    else -> call.respondText(exampleContentString)
}

    }
    get<Paths.logoutUser> {  _: Paths.logoutUser ->
        call.respond(HttpStatusCode.NotImplemented)

    }
    put<Paths.updateUser> {  _: Paths.updateUser ->
        call.respond(HttpStatusCode.NotImplemented)

    }
}
