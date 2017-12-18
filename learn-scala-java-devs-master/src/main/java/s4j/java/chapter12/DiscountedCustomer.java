/*
 * Copyright (c) 2015-2017 Toby Weston
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package s4j.java.chapter12;

@SuppressWarnings("all")
public class DiscountedCustomer extends Customer {

    public DiscountedCustomer(String name, String address) {
        super(name, address);
    }

    @Override
    public Double total() {
        return super.total() * 0.90;
    }

    public Double getDiscountAmount() {
        return 10.0;
    }

}