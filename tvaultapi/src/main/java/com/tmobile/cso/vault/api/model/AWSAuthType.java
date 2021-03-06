//=========================================================================
//Copyright 2018 T-Mobile, US
//
//Licensed under the Apache License, Version 2.0 (the "License");
//you may not use this file except in compliance with the License.
//You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
//Unless required by applicable law or agreed to in writing, software
//distributed under the License is distributed on an "AS IS" BASIS,
//WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//See the License for the specific language governing permissions and
//limitations under the License.
//See the readme.txt file for additional language around disclaimer of warranties.
//=========================================================================
package com.tmobile.cso.vault.api.model;

public enum AWSAuthType {
	EC2("ec2"),
	IAM("iam");
	
	private String auth_type;
	AWSAuthType(String auth_type) {
		this.auth_type=auth_type;
	}
	/**
	 * @return the auth_type
	 */
	public String getAuth_type() {
		return auth_type;
	}

	
}
