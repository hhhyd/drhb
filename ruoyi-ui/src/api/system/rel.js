import request from '@/utils/request'

// 查询监督员-网格员多对多关联列表
export function listRel(query) {
  return request({
    url: '/system/rel/list',
    method: 'get',
    params: query
  })
}

// 查询监督员-网格员多对多关联详细
export function getRel(id) {
  return request({
    url: '/system/rel/' + id,
    method: 'get'
  })
}

// 新增监督员-网格员多对多关联
export function addRel(data) {
  return request({
    url: '/system/rel',
    method: 'post',
    data: data
  })
}

// 修改监督员-网格员多对多关联
export function updateRel(data) {
  return request({
    url: '/system/rel',
    method: 'put',
    data: data
  })
}

// 删除监督员-网格员多对多关联
export function delRel(id) {
  return request({
    url: '/system/rel/' + id,
    method: 'delete'
  })
}
