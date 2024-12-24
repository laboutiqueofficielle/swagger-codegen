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
package io.swagger.server

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpMethod
import io.ktor.locations.handle
import io.ktor.locations.location
import io.ktor.locations.Location
import io.ktor.util.pipeline.PipelineContext
import io.ktor.routing.Route
import io.ktor.routing.method



// NOTE: ktor-location@0.9.0 is missing extension for Route.delete. This includes it.
inline fun <reified T : Any> Route.delete(noinline body: suspend PipelineContext<Unit, ApplicationCall>.(T) -> Unit): Route {
    return location(T::class) {
        method(HttpMethod.Delete) {
            handle(body)
        }
    }
}

object Paths {
    /**
     * Add a new pet to the store
     * 
     */
    @Location("/pet") class addPet()
    /**
     * Deletes a pet
     * 
     */
    @Location("/pet/{petId}") class deletePet()
    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     */
    @Location("/pet/findByStatus") class findPetsByStatus()
    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     */
    @Location("/pet/findByTags") class findPetsByTags()
    /**
     * Find pet by ID
     * Returns a single pet
     */
    @Location("/pet/{petId}") class getPetById()
    /**
     * Update an existing pet
     * 
     */
    @Location("/pet") class updatePet()
    /**
     * Updates a pet in the store with form data
     * 
     */
    @Location("/pet/{petId}") class updatePetWithForm()
    /**
     * uploads an image
     * 
     */
    @Location("/pet/{petId}/uploadImage") class uploadFile()
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     */
    @Location("/store/order/{orderId}") class deleteOrder()
    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     */
    @Location("/store/inventory") class getInventory()
    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     */
    @Location("/store/order/{orderId}") class getOrderById()
    /**
     * Place an order for a pet
     * 
     */
    @Location("/store/order") class placeOrder()
    /**
     * Create user
     * This can only be done by the logged in user.
     */
    @Location("/user") class createUser()
    /**
     * Creates list of users with given input array
     * 
     */
    @Location("/user/createWithArray") class createUsersWithArrayInput()
    /**
     * Creates list of users with given input array
     * 
     */
    @Location("/user/createWithList") class createUsersWithListInput()
    /**
     * Delete user
     * This can only be done by the logged in user.
     */
    @Location("/user/{username}") class deleteUser()
    /**
     * Get user by user name
     * 
     */
    @Location("/user/{username}") class getUserByName()
    /**
     * Logs user into the system
     * 
     */
    @Location("/user/login") class loginUser()
    /**
     * Logs out current logged in user session
     * 
     */
    @Location("/user/logout") class logoutUser()
    /**
     * Updated user
     * This can only be done by the logged in user.
     */
    @Location("/user/{username}") class updateUser()
}