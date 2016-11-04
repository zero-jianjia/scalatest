namespace java com.zero.thrift   # 定义生成代码的命名空间，与定义的package相对应

/************索引检索回复**************/
struct IndexResponse {
    1:list<SearchResp> result
}

/***********投放单的检索结果***********/
struct SearchResp {
    1:string adunitId,
    2:list<LineitemResp> lineitems
}

struct LineitemResp{
    1:string lineitemId,
    2:list<string> adIds,
    3:string directional
}
