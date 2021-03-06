/*
 * Copyright 2012 James Moger.
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

package com.iciql.test.models;

import com.iciql.Iciql.IQColumn;
import com.iciql.Iciql.IQView;

/**
 * A view containing product data.
 */

@IQView(name = "AnnotatedProductViewInherited", inheritColumns = true)
public class ProductViewFromQuery extends ProductAnnotationOnly {

    public String unmappedField;

    @IQColumn(name = "id")
    public Long productId;

    public ProductViewFromQuery() {
        // public constructor
    }

    public String toString() {
        return productName + " (" + productId + ")";
    }

}
