package com.zero.recipe

//食谱
class Recipe(val name: String, val ingredients /*原料*/ : List[Food],
        val instructions /*用法说明*/ : String) {
    override def toString = name;
}
    
