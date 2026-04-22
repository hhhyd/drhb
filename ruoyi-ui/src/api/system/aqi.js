import request from '@/utils/request'

// 查询空气质量指数级别列表
export function listAqi(query) {
  return request({
    url: '/system/aqi/list',
    method: 'get',
    params: query
  })
}

// 查询空气质量指数级别详细
export function getAqi(aqiId) {
  return request({
    url: '/system/aqi/' + aqiId,
    method: 'get'
  })
}

// 新增空气质量指数级别
export function addAqi(data) {
  return request({
    url: '/system/aqi',
    method: 'post',
    data: data
  })
}

// 修改空气质量指数级别
export function updateAqi(data) {
  return request({
    url: '/system/aqi',
    method: 'put',
    data: data
  })
}

// 删除空气质量指数级别
export function delAqi(aqiId) {
  return request({
    url: '/system/aqi/' + aqiId,
    method: 'delete'
  })
}
