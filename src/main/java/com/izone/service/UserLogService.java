/**
 * Copyright (c) 2015, biezhi 王爵 (biezhi.me@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.izone.service;

public interface UserLogService {

	/**
	 * 保存用户日志	
	 * @param uid			用户id
	 * @param action		操作动作
	 * @param action_data	日志数据
	 * @return				返回是否保存成功
	 */
	boolean saveUserLog(String uid, String action, String action_data);
	
}
