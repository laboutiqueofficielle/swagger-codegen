//
// ArrayOfArrayOfNumberOnly.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ArrayOfArrayOfNumberOnly: Codable {

    public var arrayArrayNumber: [[Double]]?

    public init(arrayArrayNumber: [[Double]]?) {
        self.arrayArrayNumber = arrayArrayNumber
    }

    public enum CodingKeys: String, CodingKey { 
        case arrayArrayNumber = "ArrayArrayNumber"
    }


}

