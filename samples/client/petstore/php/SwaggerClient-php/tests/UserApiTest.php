<?php

namespace Swagger\Client;

use Swagger\Client\Api\UserApi;

class UserApiTest extends \PHPUnit_Framework_TestCase
{
    /** @var UserApi*/
    private $api;

    // add a new pet (id 10005) to ensure the pet object is available for all the tests
    public function setUp()
    {
        $this->api = new UserApi();
    }

    // test login user
    public function testLoginUser()
    {
        // login
        $response = $this->api->loginUser('xxxxx', 'yyyyyyyy');
        
        $this->assertInternalType('string', $response);
        $this->assertRegExp(
            '/^logged in user session/',
            $response,
            "response string starts with 'logged in user session'"
        );

    }
}
