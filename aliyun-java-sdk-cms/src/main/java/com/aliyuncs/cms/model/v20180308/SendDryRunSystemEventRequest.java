/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SendDryRunSystemEventRequest extends RpcAcsRequest<SendDryRunSystemEventResponse> {
	
	public SendDryRunSystemEventRequest() {
		super("Cms", "2018-03-08", "SendDryRunSystemEvent", "cms");
	}

	private String product;

	private String groupId;

	private String eventName;

	private String eventContent;

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
		if(eventName != null){
			putQueryParameter("EventName", eventName);
		}
	}

	public String getEventContent() {
		return this.eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
		if(eventContent != null){
			putQueryParameter("EventContent", eventContent);
		}
	}

	@Override
	public Class<SendDryRunSystemEventResponse> getResponseClass() {
		return SendDryRunSystemEventResponse.class;
	}

}
