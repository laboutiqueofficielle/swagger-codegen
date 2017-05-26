<?php

namespace Swagger\Client;

use Swagger\Client\Api\StoreApi;

class StoreApiTest extends \PHPUnit_Framework_TestCase
{
    /** @var  StoreApi */
    private $api;

    public function setUp()
    {
        $this->api = new Api\StoreApi();
    }

    // test get inventory
    public function testGetInventory()
    {
        $result = $this->api->getInventory();

        $this->assertInternalType("array", $result);
        $this->assertInternalType("int", $result['available']);
    }

    /*
     * comment out as we've removed invalid endpoints from the spec, we'll introduce something
     * similar in the future when we've time to update the petstore server
     *
    // test get inventory
    public function testGetInventoryInObject()
    {
        // initialize the API client
        //$config = (new Configuration())->setHost('http://petstore.swagger.io/v2');
        $api_client = new ApiClient();
        $store_api = new Api\StoreApi($api_client);
        // get inventory
        $get_response = $store_api->getInventoryInObject();

        $this->assertInternalType("array", $get_response);
        $this->assertInternalType("int", $get_response['available']);
    }
     */

    /**
     * test empty array response
     *
     * Make sure empty arrays from a producer is actually returned as
     * an empty array and not some other value. At some point it was
     * returned as null because the code stumbled on PHP loose type
     * checking (not on empty array is true, same thing could happen
     * with careless use of empty()).
     */
//    public function testEmptyArrayResponse()
//    {
//        // this call returns and empty array
//        $response = $this->api->findPetsByStatus(array());
//
//        // make sure this is an array as we want it to be
//        $this->assertInternalType("array", $response);
//
//        // make sure the array is empty just in case the petstore
//        // server changes its output
//        $this->assertEmpty($response);
//    }
}
